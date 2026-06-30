package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes9.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.biz.a f198771d;

    public c(com.tencent.mm.ui.chatting.component.biz.a aVar) {
        this.f198771d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.chatting.component.biz.a aVar = this.f198771d;
        qk.o oVar = aVar.f198746h;
        oVar.field_hadAlert = 1;
        if (oVar != null) {
            oVar.field_brandFlag &= -5;
            r01.z.p(oVar);
        }
        r01.q3.Zi().f(aVar.f198580d.x());
    }
}
