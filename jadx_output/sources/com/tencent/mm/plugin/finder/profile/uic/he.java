package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes5.dex */
public final class he extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ie f123768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(com.tencent.mm.plugin.finder.profile.uic.ie ieVar) {
        super(0);
        this.f123768d = ieVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        com.tencent.mm.plugin.finder.profile.uic.ie ieVar = this.f123768d;
        textPaint.setTextSize(ieVar.getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479628b3) * i65.a.q(ieVar.getContext()));
        return textPaint;
    }
}
