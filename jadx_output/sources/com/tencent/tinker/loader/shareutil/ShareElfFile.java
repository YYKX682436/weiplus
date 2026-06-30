package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareElfFile implements java.io.Closeable {
    public static final int FILE_TYPE_ELF = 1;
    public static final int FILE_TYPE_ODEX = 0;
    public static final int FILE_TYPE_OTHERS = -1;
    public com.tencent.tinker.loader.shareutil.ShareElfFile.ElfHeader elfHeader;
    private final java.io.FileInputStream fis;
    public com.tencent.tinker.loader.shareutil.ShareElfFile.ProgramHeader[] programHeaders;
    public com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader[] sectionHeaders;
    private final java.util.Map<java.lang.String, com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader> sectionNameToHeaderMap = new java.util.HashMap();

    /* loaded from: classes13.dex */
    public static class ElfHeader {
        public static final int EI_CLASS = 4;
        public static final int EI_DATA = 5;
        private static final int EI_NINDENT = 16;
        public static final int EI_VERSION = 6;
        public static final int ELFCLASS32 = 1;
        public static final int ELFCLASS64 = 2;
        public static final int ELFDATA2LSB = 1;
        public static final int ELFDATA2MSB = 2;
        public static final int ET_CORE = 4;
        public static final int ET_DYN = 3;
        public static final int ET_EXEC = 2;
        public static final int ET_HIPROC = 65535;
        public static final int ET_LOPROC = 65280;
        public static final int ET_NONE = 0;
        public static final int ET_REL = 1;
        public static final int EV_CURRENT = 1;
        public final short eEhSize;
        public final long eEntry;
        public final int eFlags;
        public final byte[] eIndent;
        public final short eMachine;
        public final short ePhEntSize;
        public final short ePhNum;
        public final long ePhOff;
        public final short eShEntSize;
        public final short eShNum;
        public final long eShOff;
        public final short eShStrNdx;
        public final short eType;
        public final int eVersion;

        private ElfHeader(java.nio.channels.FileChannel fileChannel) {
            byte[] bArr = new byte[16];
            this.eIndent = bArr;
            fileChannel.position(0L);
            fileChannel.read(java.nio.ByteBuffer.wrap(bArr));
            if (bArr[0] == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
                com.tencent.tinker.loader.shareutil.ShareElfFile.assertInRange(bArr[4], 1, 2, "bad elf class: " + ((int) bArr[4]));
                com.tencent.tinker.loader.shareutil.ShareElfFile.assertInRange(bArr[5], 1, 2, "bad elf data encoding: " + ((int) bArr[5]));
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bArr[4] == 1 ? 36 : 48);
                allocate.order(bArr[5] == 1 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN);
                com.tencent.tinker.loader.shareutil.ShareElfFile.readUntilLimit(fileChannel, allocate, "failed to read rest part of ehdr.");
                this.eType = allocate.getShort();
                this.eMachine = allocate.getShort();
                int i17 = allocate.getInt();
                this.eVersion = i17;
                com.tencent.tinker.loader.shareutil.ShareElfFile.assertInRange(i17, 1, 1, "bad elf version: " + i17);
                byte b17 = bArr[4];
                if (b17 == 1) {
                    this.eEntry = allocate.getInt();
                    this.ePhOff = allocate.getInt();
                    this.eShOff = allocate.getInt();
                } else if (b17 == 2) {
                    this.eEntry = allocate.getLong();
                    this.ePhOff = allocate.getLong();
                    this.eShOff = allocate.getLong();
                } else {
                    throw new java.io.IOException("Unexpected elf class: " + ((int) bArr[4]));
                }
                this.eFlags = allocate.getInt();
                this.eEhSize = allocate.getShort();
                this.ePhEntSize = allocate.getShort();
                this.ePhNum = allocate.getShort();
                this.eShEntSize = allocate.getShort();
                this.eShNum = allocate.getShort();
                this.eShStrNdx = allocate.getShort();
                return;
            }
            throw new java.io.IOException(java.lang.String.format("bad elf magic: %x %x %x %x.", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3])));
        }
    }

    /* loaded from: classes13.dex */
    public static class ProgramHeader {
        public static final int PF_R = 4;
        public static final int PF_W = 2;
        public static final int PF_X = 1;
        public static final int PT_DYNAMIC = 2;
        public static final int PT_HIPROC = Integer.MAX_VALUE;
        public static final int PT_INTERP = 3;
        public static final int PT_LOAD = 1;
        public static final int PT_LOPROC = 1879048192;
        public static final int PT_NOTE = 4;
        public static final int PT_NULL = 0;
        public static final int PT_PHDR = 6;
        public static final int PT_SHLIB = 5;
        public final long pAlign;
        public final long pFileSize;
        public final int pFlags;
        public final long pMemSize;
        public final long pOffset;
        public final long pPddr;
        public final int pType;
        public final long pVddr;

        private ProgramHeader(java.nio.ByteBuffer byteBuffer, int i17) {
            if (i17 == 1) {
                this.pType = byteBuffer.getInt();
                this.pOffset = byteBuffer.getInt();
                this.pVddr = byteBuffer.getInt();
                this.pPddr = byteBuffer.getInt();
                this.pFileSize = byteBuffer.getInt();
                this.pMemSize = byteBuffer.getInt();
                this.pFlags = byteBuffer.getInt();
                this.pAlign = byteBuffer.getInt();
                return;
            }
            if (i17 == 2) {
                this.pType = byteBuffer.getInt();
                this.pFlags = byteBuffer.getInt();
                this.pOffset = byteBuffer.getLong();
                this.pVddr = byteBuffer.getLong();
                this.pPddr = byteBuffer.getLong();
                this.pFileSize = byteBuffer.getLong();
                this.pMemSize = byteBuffer.getLong();
                this.pAlign = byteBuffer.getLong();
                return;
            }
            throw new java.io.IOException("Unexpected elf class: " + i17);
        }
    }

    /* loaded from: classes13.dex */
    public static class SectionHeader {
        public static final int SHF_ALLOC = 2;
        public static final int SHF_EXECINSTR = 4;
        public static final int SHF_MASKPROC = -268435456;
        public static final int SHF_WRITE = 1;
        public static final int SHN_ABS = 65521;
        public static final int SHN_COMMON = 65522;
        public static final int SHN_HIPROC = 65311;
        public static final int SHN_HIRESERVE = 65535;
        public static final int SHN_LOPROC = 65280;
        public static final int SHN_LORESERVE = 65280;
        public static final int SHN_UNDEF = 0;
        public static final int SHT_DYNAMIC = 6;
        public static final int SHT_DYNSYM = 11;
        public static final int SHT_HASH = 5;
        public static final int SHT_HIPROC = Integer.MAX_VALUE;
        public static final int SHT_HIUSER = -1;
        public static final int SHT_LOPROC = 1879048192;
        public static final int SHT_LOUSER = Integer.MIN_VALUE;
        public static final int SHT_NOBITS = 8;
        public static final int SHT_NOTE = 7;
        public static final int SHT_NULL = 0;
        public static final int SHT_PROGBITS = 1;
        public static final int SHT_REL = 9;
        public static final int SHT_RELA = 4;
        public static final int SHT_SHLIB = 10;
        public static final int SHT_STRTAB = 3;
        public static final int SHT_SYMTAB = 2;
        public final long shAddr;
        public final long shAddrAlign;
        public final long shEntSize;
        public final long shFlags;
        public final int shInfo;
        public final int shLink;
        public final int shName;
        public java.lang.String shNameStr;
        public final long shOffset;
        public final long shSize;
        public final int shType;

        private SectionHeader(java.nio.ByteBuffer byteBuffer, int i17) {
            if (i17 == 1) {
                this.shName = byteBuffer.getInt();
                this.shType = byteBuffer.getInt();
                this.shFlags = byteBuffer.getInt();
                this.shAddr = byteBuffer.getInt();
                this.shOffset = byteBuffer.getInt();
                this.shSize = byteBuffer.getInt();
                this.shLink = byteBuffer.getInt();
                this.shInfo = byteBuffer.getInt();
                this.shAddrAlign = byteBuffer.getInt();
                this.shEntSize = byteBuffer.getInt();
            } else if (i17 == 2) {
                this.shName = byteBuffer.getInt();
                this.shType = byteBuffer.getInt();
                this.shFlags = byteBuffer.getLong();
                this.shAddr = byteBuffer.getLong();
                this.shOffset = byteBuffer.getLong();
                this.shSize = byteBuffer.getLong();
                this.shLink = byteBuffer.getInt();
                this.shInfo = byteBuffer.getInt();
                this.shAddrAlign = byteBuffer.getLong();
                this.shEntSize = byteBuffer.getLong();
            } else {
                throw new java.io.IOException("Unexpected elf class: " + i17);
            }
            this.shNameStr = null;
        }
    }

    public ShareElfFile(java.io.File file) {
        com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader[] sectionHeaderArr;
        this.elfHeader = null;
        this.programHeaders = null;
        this.sectionHeaders = null;
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        this.fis = fileInputStream;
        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
        this.elfHeader = new com.tencent.tinker.loader.shareutil.ShareElfFile.ElfHeader(channel);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(128);
        allocate.limit(this.elfHeader.ePhEntSize);
        allocate.order(this.elfHeader.eIndent[5] == 1 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN);
        channel.position(this.elfHeader.ePhOff);
        this.programHeaders = new com.tencent.tinker.loader.shareutil.ShareElfFile.ProgramHeader[this.elfHeader.ePhNum];
        for (int i17 = 0; i17 < this.programHeaders.length; i17++) {
            readUntilLimit(channel, allocate, "failed to read phdr.");
            this.programHeaders[i17] = new com.tencent.tinker.loader.shareutil.ShareElfFile.ProgramHeader(allocate, this.elfHeader.eIndent[4]);
        }
        channel.position(this.elfHeader.eShOff);
        allocate.limit(this.elfHeader.eShEntSize);
        this.sectionHeaders = new com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader[this.elfHeader.eShNum];
        int i18 = 0;
        while (true) {
            sectionHeaderArr = this.sectionHeaders;
            if (i18 >= sectionHeaderArr.length) {
                break;
            }
            readUntilLimit(channel, allocate, "failed to read shdr.");
            this.sectionHeaders[i18] = new com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader(allocate, this.elfHeader.eIndent[4]);
            i18++;
        }
        short s17 = this.elfHeader.eShStrNdx;
        if (s17 > 0) {
            java.nio.ByteBuffer section = getSection(sectionHeaderArr[s17]);
            for (com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader sectionHeader : this.sectionHeaders) {
                section.position(sectionHeader.shName);
                java.lang.String readCString = readCString(section);
                sectionHeader.shNameStr = readCString;
                this.sectionNameToHeaderMap.put(readCString, sectionHeader);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertInRange(int i17, int i18, int i19, java.lang.String str) {
        if (i17 < i18 || i17 > i19) {
            throw new java.io.IOException(str);
        }
    }

    public static int getFileTypeByMagic(java.io.File file) {
        java.io.FileInputStream fileInputStream = null;
        try {
            byte[] bArr = new byte[4];
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                fileInputStream2.read(bArr);
                byte b17 = bArr[0];
                if (b17 == 100 && bArr[1] == 101 && bArr[2] == 121 && bArr[3] == 10) {
                    try {
                        fileInputStream2.close();
                    } catch (java.lang.Throwable unused) {
                    }
                    return 0;
                }
                if (b17 == Byte.MAX_VALUE && bArr[1] == 69 && bArr[2] == 76) {
                    if (bArr[3] == 70) {
                        try {
                            fileInputStream2.close();
                        } catch (java.lang.Throwable unused2) {
                        }
                        return 1;
                    }
                }
                try {
                    fileInputStream2.close();
                    return -1;
                } catch (java.lang.Throwable unused3) {
                    return -1;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static java.lang.String readCString(java.nio.ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && array[byteBuffer.position()] != 0) {
            byteBuffer.position(byteBuffer.position() + 1);
        }
        byteBuffer.position(byteBuffer.position() + 1);
        return new java.lang.String(array, position, (byteBuffer.position() - position) - 1, java.nio.charset.Charset.forName("ASCII"));
    }

    public static void readUntilLimit(java.nio.channels.FileChannel fileChannel, java.nio.ByteBuffer byteBuffer, java.lang.String str) {
        byteBuffer.rewind();
        int read = fileChannel.read(byteBuffer);
        if (read == byteBuffer.limit()) {
            byteBuffer.flip();
            return;
        }
        throw new java.io.IOException(str + " Rest bytes insufficient, expect to read " + byteBuffer.limit() + " bytes but only " + read + " bytes were read.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.fis.close();
        this.sectionNameToHeaderMap.clear();
        this.programHeaders = null;
        this.sectionHeaders = null;
    }

    public java.nio.channels.FileChannel getChannel() {
        return this.fis.getChannel();
    }

    public java.nio.ByteOrder getDataOrder() {
        return this.elfHeader.eIndent[5] == 1 ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
    }

    public java.nio.ByteBuffer getSection(com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader sectionHeader) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) sectionHeader.shSize);
        this.fis.getChannel().position(sectionHeader.shOffset);
        readUntilLimit(this.fis.getChannel(), allocate, "failed to read section: " + sectionHeader.shNameStr);
        return allocate;
    }

    public com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader getSectionHeaderByName(java.lang.String str) {
        return this.sectionNameToHeaderMap.get(str);
    }

    public java.nio.ByteBuffer getSegment(com.tencent.tinker.loader.shareutil.ShareElfFile.ProgramHeader programHeader) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate((int) programHeader.pFileSize);
        this.fis.getChannel().position(programHeader.pOffset);
        readUntilLimit(this.fis.getChannel(), allocate, "failed to read segment (type: " + programHeader.pType + ").");
        return allocate;
    }

    public boolean is32BitElf() {
        return this.elfHeader.eIndent[4] == 1;
    }
}
