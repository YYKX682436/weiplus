package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class z4 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f206280a;

    public z4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f206280a = h4Var;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 227) {
            com.tencent.mm.ui.chatting.h4 h4Var = this.f206280a;
            h4Var.K(h4Var.f201645j, i18, intent);
        }
    }
}
