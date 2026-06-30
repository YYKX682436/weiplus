package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public abstract class l5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213067d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f213068e;

    public l5(java.lang.String str, java.lang.String str2) {
        this.f213067d = str.replace('/', (char) 0);
        this.f213068e = str2;
    }

    public java.lang.String toString() {
        return this.f213067d.replace((char) 0, '/') + " -> " + this.f213068e;
    }
}
