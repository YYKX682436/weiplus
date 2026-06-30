package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class w4 extends com.tencent.mm.vfs.o8 {

    /* renamed from: f, reason: collision with root package name */
    public final java.security.Key f213227f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.RC4EncryptedFileSystem f213228g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.vfs.RC4EncryptedFileSystem rC4EncryptedFileSystem, com.tencent.mm.vfs.q2 q2Var, java.security.Key key) {
        super(q2Var);
        this.f213228g = rC4EncryptedFileSystem;
        this.f213227f = key;
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public long G(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
        if (q2Var instanceof com.tencent.mm.vfs.w4) {
            com.tencent.mm.vfs.w4 w4Var = (com.tencent.mm.vfs.w4) q2Var;
            com.tencent.mm.vfs.RC4EncryptedFileSystem rC4EncryptedFileSystem = w4Var.f213228g;
            com.tencent.mm.vfs.v2 v2Var = rC4EncryptedFileSystem.f212747f;
            com.tencent.mm.vfs.RC4EncryptedFileSystem rC4EncryptedFileSystem2 = this.f213228g;
            if (v2Var == rC4EncryptedFileSystem2.f212747f && rC4EncryptedFileSystem.f212748g.equals(rC4EncryptedFileSystem2.f212748g) && w4Var.f213227f.equals(this.f213227f)) {
                com.tencent.mm.vfs.q2 q2Var2 = this.f213118e;
                if (q2Var2 instanceof com.tencent.mm.vfs.a) {
                    return ((com.tencent.mm.vfs.a) q2Var2).G(str, w4Var.f213118e, str2, z17);
                }
            }
        }
        return super.G(str, q2Var, str2, z17);
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.a
    public boolean H(java.lang.String str, com.tencent.mm.vfs.q2 q2Var, java.lang.String str2) {
        if (q2Var instanceof com.tencent.mm.vfs.w4) {
            com.tencent.mm.vfs.w4 w4Var = (com.tencent.mm.vfs.w4) q2Var;
            com.tencent.mm.vfs.RC4EncryptedFileSystem rC4EncryptedFileSystem = w4Var.f213228g;
            com.tencent.mm.vfs.v2 v2Var = rC4EncryptedFileSystem.f212747f;
            com.tencent.mm.vfs.RC4EncryptedFileSystem rC4EncryptedFileSystem2 = this.f213228g;
            if (v2Var == rC4EncryptedFileSystem2.f212747f && rC4EncryptedFileSystem.f212748g.equals(rC4EncryptedFileSystem2.f212748g) && w4Var.f213227f.equals(this.f213227f)) {
                com.tencent.mm.vfs.q2 q2Var2 = this.f213118e;
                if (q2Var2 instanceof com.tencent.mm.vfs.a) {
                    return ((com.tencent.mm.vfs.a) q2Var2).H(str, w4Var.f213118e, str2);
                }
            }
        }
        return super.H(str, q2Var, str2);
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.io.InputStream a(java.lang.String str) {
        java.security.Key key = this.f213227f;
        if (key == null) {
            throw new java.io.FileNotFoundException("Key is not initialized.");
        }
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RC4");
            cipher.init(2, key);
            return new javax.crypto.CipherInputStream(this.f213118e.a(str), cipher);
        } catch (java.security.GeneralSecurityException e17) {
            throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("Failed to initialize cipher: " + e17.getMessage()).initCause(e17));
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public java.io.OutputStream c(java.lang.String str, boolean z17) {
        java.security.Key key = this.f213227f;
        if (key == null) {
            throw new java.io.FileNotFoundException("Key is not initialized.");
        }
        if (z17) {
            throw new java.io.FileNotFoundException("Appending encrypted files is not supported.");
        }
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RC4");
            cipher.init(1, key);
            return new javax.crypto.CipherOutputStream(this.f213118e.c(str, false), cipher);
        } catch (java.security.GeneralSecurityException e17) {
            throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("Failed to initialize cipher: " + e17.getMessage()).initCause(e17));
        }
    }

    @Override // com.tencent.mm.vfs.o8, com.tencent.mm.vfs.q2
    public int o() {
        return this.f213118e.o() & (-19);
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "rc4 <- " + this.f213118e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213228g;
    }
}
