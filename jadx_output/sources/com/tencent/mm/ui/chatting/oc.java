package com.tencent.mm.ui.chatting;

/* loaded from: classes14.dex */
public final class oc implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.pc f202073a;

    public oc(com.tencent.mm.ui.chatting.pc pcVar) {
        this.f202073a = pcVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num != null && num.intValue() == 0) {
            return;
        }
        com.tencent.mm.ui.chatting.pc pcVar = this.f202073a;
        if (num != null && -17 == num.intValue()) {
            db5.t7.g(pcVar.getContext(), pcVar.getContext().getString(com.tencent.mm.R.string.cf6));
        } else {
            db5.t7.g(pcVar.getContext(), pcVar.getContext().getString(com.tencent.mm.R.string.ibr));
        }
        if (pcVar.f202093f == 3) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().h();
        }
    }
}
