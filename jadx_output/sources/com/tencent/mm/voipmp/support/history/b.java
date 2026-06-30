package com.tencent.mm.voipmp.support.history;

/* loaded from: classes8.dex */
public final class b implements com.tencent.mm.voipmp.support.history.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213762d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f213763e;

    public b(java.lang.String talker, java.lang.String str) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f213762d = talker;
        this.f213763e = str;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
