package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class n7 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f192875a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f192876b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f192877c;

    /* renamed from: d, reason: collision with root package name */
    public long f192878d;

    /* renamed from: e, reason: collision with root package name */
    public long f192879e;

    /* renamed from: f, reason: collision with root package name */
    public long f192880f;

    /* renamed from: g, reason: collision with root package name */
    public long f192881g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f192882h;

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.n7 n7Var = (com.tencent.mm.sdk.platformtools.n7) obj;
        if (this.f192881g != n7Var.f192881g) {
            return false;
        }
        long j17 = this.f192878d - n7Var.f192878d;
        long j18 = this.f192879e - n7Var.f192879e;
        long j19 = this.f192880f - n7Var.f192880f;
        return java.lang.Math.abs(j17 - j18) <= 4 && java.lang.Math.abs(j17 - j19) <= 4 && java.lang.Math.abs(j18 - j19) <= 4;
    }

    public java.lang.String toString() {
        return "{DevName=" + this.f192875a + ", MountDir=" + this.f192876b + ", FileSystem=" + this.f192877c + ", TotalBlocks=" + this.f192878d + ", FreeBlocks=" + this.f192879e + ", AvailableBlocks=" + this.f192880f + ", BlockSize=" + this.f192881g + ", Shared=false}";
    }
}
