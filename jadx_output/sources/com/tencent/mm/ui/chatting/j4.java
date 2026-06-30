package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public class j4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f201868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f201870f;

    public j4(com.tencent.mm.ui.chatting.h4 h4Var, boolean z17, int i17) {
        this.f201870f = h4Var;
        this.f201868d = z17;
        this.f201869e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17 = this.f201868d;
        com.tencent.mm.ui.chatting.h4 h4Var = this.f201870f;
        int i18 = this.f201869e;
        if (z17) {
            com.tencent.mm.ui.chatting.h4.O(12, i18, h4Var.f201647l);
        } else {
            com.tencent.mm.ui.chatting.h4.O(9, i18, h4Var.f201647l);
        }
    }
}
