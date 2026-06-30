package com.tencent.mm.plugin.finder.live.wish.view;

/* loaded from: classes3.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ot3 f120620d;

    public a(r45.ot3 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f120620d = info;
    }

    @Override // in5.c
    public long getItemId() {
        java.lang.String string;
        r45.ot3 ot3Var = this.f120620d;
        if (ot3Var == null || (string = ot3Var.getString(0)) == null) {
            return 0L;
        }
        return string.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
