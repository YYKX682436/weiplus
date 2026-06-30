package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public final class ShareOatUtil {
    private static final java.lang.String TAG = "Tinker.OatUtil";

    /* renamed from: com.tencent.tinker.loader.shareutil.ShareOatUtil$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet;

        static {
            int[] iArr = new int[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.values().length];
            $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet = iArr;
            try {
                iArr[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kArm.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kThumb2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kArm64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kX86.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kX86_64.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kMips.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kMips64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.kNone.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes13.dex */
    public enum InstructionSet {
        kNone,
        kArm,
        kArm64,
        kThumb2,
        kX86,
        kX86_64,
        kMips,
        kMips64
    }

    private ShareOatUtil() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static java.lang.String getOatFileInstructionSet(java.io.File file) {
        java.lang.String str;
        com.tencent.tinker.loader.shareutil.ShareElfFile shareElfFile = null;
        try {
            com.tencent.tinker.loader.shareutil.ShareElfFile shareElfFile2 = new com.tencent.tinker.loader.shareutil.ShareElfFile(file);
            try {
                com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader sectionHeaderByName = shareElfFile2.getSectionHeaderByName(".rodata");
                if (sectionHeaderByName == null) {
                    throw new java.io.IOException("Unable to find .rodata section.");
                }
                java.nio.channels.FileChannel channel = shareElfFile2.getChannel();
                channel.position(sectionHeaderByName.shOffset);
                byte[] bArr = new byte[8];
                com.tencent.tinker.loader.shareutil.ShareElfFile.readUntilLimit(channel, java.nio.ByteBuffer.wrap(bArr), "Failed to read oat magic and version.");
                if (bArr[0] != 111 || bArr[1] != 97 || bArr[2] != 116 || bArr[3] != 10) {
                    throw new java.io.IOException(java.lang.String.format("Bad oat magic: %x %x %x %x", java.lang.Byte.valueOf(bArr[0]), java.lang.Byte.valueOf(bArr[1]), java.lang.Byte.valueOf(bArr[2]), java.lang.Byte.valueOf(bArr[3])));
                }
                java.lang.String str2 = new java.lang.String(bArr, 4, 3, java.nio.charset.Charset.forName("ASCII"));
                try {
                    java.lang.Integer.parseInt(str2);
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(128);
                    allocate.order(shareElfFile2.getDataOrder());
                    channel.position(sectionHeaderByName.shOffset + 12);
                    allocate.limit(4);
                    com.tencent.tinker.loader.shareutil.ShareElfFile.readUntilLimit(channel, allocate, "Failed to read isa num.");
                    int i17 = allocate.getInt();
                    if (i17 < 0 || i17 >= com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.values().length) {
                        throw new java.io.IOException("Bad isa num: " + i17);
                    }
                    switch (com.tencent.tinker.loader.shareutil.ShareOatUtil.AnonymousClass1.$SwitchMap$com$tencent$tinker$loader$shareutil$ShareOatUtil$InstructionSet[com.tencent.tinker.loader.shareutil.ShareOatUtil.InstructionSet.values()[i17].ordinal()]) {
                        case 1:
                        case 2:
                            str = "arm";
                            break;
                        case 3:
                            str = "arm64";
                            break;
                        case 4:
                            str = "x86";
                            break;
                        case 5:
                            str = "x86_64";
                            break;
                        case 6:
                            str = "mips";
                            break;
                        case 7:
                            str = "mips64";
                            break;
                        case 8:
                            str = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
                            break;
                        default:
                            throw new java.io.IOException("Should not reach here.");
                    }
                    try {
                        shareElfFile2.close();
                    } catch (java.lang.Exception unused) {
                    }
                    return str;
                } catch (java.lang.NumberFormatException unused2) {
                    throw new java.io.IOException("Bad oat version: ".concat(str2));
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                shareElfFile = shareElfFile2;
                if (shareElfFile != null) {
                    try {
                        shareElfFile.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
