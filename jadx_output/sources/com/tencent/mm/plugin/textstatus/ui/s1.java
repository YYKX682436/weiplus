package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.textstatus.ui.w1 w1Var, android.content.Context context) {
        super(0);
        this.f174257d = w1Var;
        this.f174258e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.textstatus.ui.w1 w1Var = this.f174257d;
        final java.lang.String scene = w1Var.getScene();
        final android.content.Context context = this.f174258e;
        return new com.tencent.mm.plugin.textstatus.ui.i1(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.MultipleStatusCardView$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    return new ij4.c();
                }
                bi4.m0 cardEventListener = com.tencent.mm.plugin.textstatus.ui.w1.this.getCardEventListener();
                java.lang.String str = scene;
                java.util.ArrayList<java.lang.String> likedStatusIdList = com.tencent.mm.plugin.textstatus.ui.w1.this.getLikedStatusIdList();
                if (likedStatusIdList == null) {
                    likedStatusIdList = new java.util.ArrayList<>();
                }
                return new ij4.h(cardEventListener, str, likedStatusIdList, context, com.tencent.mm.plugin.textstatus.ui.w1.this.getCustomShowParam());
            }
        }, new java.util.ArrayList());
    }
}
