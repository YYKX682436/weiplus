package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes.dex */
public class s7 implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201361e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f201362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201363g;

    public s7(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, int i17, int i18, android.content.Intent intent) {
        this.f201363g = imageGalleryUI;
        this.f201360d = i17;
        this.f201361e = i18;
        this.f201362f = intent;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        java.lang.String str = (java.lang.String) obj2;
        java.lang.Integer num = (java.lang.Integer) obj3;
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(this.f201360d)) {
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(this.f201363g, str, num.intValue(), true, this.f201360d, this.f201361e, this.f201362f)) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
