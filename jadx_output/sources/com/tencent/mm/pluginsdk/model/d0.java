package com.tencent.mm.pluginsdk.model;

/* loaded from: classes15.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f189270a;

    public d0(java.lang.String id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f189270a = 0;
    }

    public final void a(long j17) {
        int i17 = this.f189270a;
        if (i17 == 3 || i17 == 1) {
            this.f189270a = 2;
            if (j17 >= 0) {
                return;
            }
            java.lang.System.currentTimeMillis();
        }
    }
}
