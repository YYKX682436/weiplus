package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public final class m extends com.tencent.mm.ui.contact.item.a {
    public final boolean C;
    public final jz5.g D;
    public final jz5.g E;
    public p13.l F;
    public java.lang.CharSequence G;

    public m(int i17, boolean z17) {
        super(8, i17);
        this.C = z17;
        this.D = jz5.h.b(new com.tencent.mm.ui.contact.item.l(this));
        this.E = jz5.h.b(new com.tencent.mm.ui.contact.item.k(this));
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public void a(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar) {
        android.text.TextPaint paint;
        if (bVar instanceof com.tencent.mm.ui.contact.item.i) {
            p13.l lVar = this.F;
            java.lang.String str = lVar != null ? lVar.f351114e : null;
            if (lVar == null || str == null) {
                return;
            }
            this.f206819z = lVar.f351114e;
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L == null) {
                L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
            }
            f(L);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String d17 = this.B.d1();
            java.lang.String str2 = this.f206849r;
            ((sg3.a) v0Var).getClass();
            java.lang.String f17 = c01.a2.f(d17, str2);
            if (kotlin.jvm.internal.o.b(f17, lVar.f351115f)) {
                this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, f17, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
                p13.i iVar = new p13.i();
                iVar.f351093a = this.f206818y;
                iVar.f351094b = this.A;
                iVar.f351095c = lVar.f351118i;
                iVar.f351096d = lVar.f351119j;
                android.widget.TextView textView = ((com.tencent.mm.ui.contact.item.i) bVar).f206881e;
                iVar.f351100h = textView != null ? textView.getPaint() : null;
                this.f206818y = o13.q.e(iVar).f351105a;
                return;
            }
            this.f206818y = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, f17, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = lVar.f351115f;
            com.tencent.mm.ui.contact.item.i iVar2 = (com.tencent.mm.ui.contact.item.i) bVar;
            android.widget.TextView textView2 = iVar2.f206881e;
            float textSize = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0.0f : paint.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str3, textSize);
            p13.i iVar3 = new p13.i();
            iVar3.f351093a = j17;
            iVar3.f351094b = this.A;
            iVar3.f351095c = lVar.f351118i;
            iVar3.f351096d = lVar.f351119j;
            android.widget.TextView textView3 = iVar2.f206881e;
            iVar3.f351100h = textView3 != null ? textView3.getPaint() : null;
            this.G = o13.q.e(iVar3).f351105a;
        }
    }

    @Override // com.tencent.mm.ui.contact.item.d
    public com.tencent.mm.ui.contact.item.c b() {
        return (com.tencent.mm.ui.contact.item.j) ((jz5.n) this.D).getValue();
    }
}
