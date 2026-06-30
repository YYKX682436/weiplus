package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class qq extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.qq f132904d = new com.tencent.mm.plugin.finder.view.qq();

    public qq() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.res.Resources resources;
        int i17;
        android.content.res.Resources resources2;
        int i18;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        if (booleanValue) {
            if (booleanValue2) {
                resources2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                i18 = com.tencent.mm.R.string.e7p;
            } else {
                resources2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                i18 = com.tencent.mm.R.string.e7n;
            }
            java.lang.String string = resources2.getString(i18);
            kotlin.jvm.internal.o.d(string);
            db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, string, com.tencent.mm.plugin.finder.view.oq.f132801a);
        } else {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7a);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(string2);
            if (booleanValue2) {
                resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                i17 = com.tencent.mm.R.string.e7i;
            } else {
                resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
                i17 = com.tencent.mm.R.string.e7o;
            }
            sb6.append(resources.getString(i17));
            db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, sb6.toString(), com.tencent.mm.plugin.finder.view.pq.f132856a);
        }
        return jz5.f0.f302826a;
    }
}
