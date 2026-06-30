package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class me extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.me f127191d = new com.tencent.mm.plugin.finder.storage.me();

    public me() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int size;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("当前funcMsg的callback数量:");
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        synchronized (d17.f70769i) {
            size = ((java.util.Set) ((java.util.HashMap) d17.f70769i).get(825)).size();
        }
        sb6.append(size);
        db5.t7.makeText(context, sb6.toString(), 1).show();
        return jz5.f0.f302826a;
    }
}
