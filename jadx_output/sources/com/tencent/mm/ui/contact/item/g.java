package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class g implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.h f206870a;

    public g(com.tencent.mm.ui.contact.item.h hVar) {
        this.f206870a = hVar;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false);
        com.tencent.mm.ui.contact.item.h hVar = this.f206870a;
        com.tencent.mm.ui.contact.item.f fVar = hVar.G;
        fVar.f206865b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        fVar.f206866c = textView;
        textView.setMaxWidth(i65.a.b(context, 200));
        fVar.f206868e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        fVar.f206867d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        fVar.f206864a = inflate.findViewById(com.tencent.mm.R.id.mjc);
        fVar.f206869f = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        if (hVar.f206840i) {
            fVar.f206864a.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
        }
        inflate.setTag(fVar);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        com.tencent.mm.ui.contact.item.h hVar = this.f206870a;
        if (hVar.C == null) {
            return false;
        }
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(hVar.f206848q, hVar.C, 1);
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.f fVar = (com.tencent.mm.ui.contact.item.f) bVar;
        com.tencent.mm.ui.contact.item.h hVar = (com.tencent.mm.ui.contact.item.h) dVar;
        java.lang.String str = hVar.f206819z;
        if (str == null || str.length() <= 0) {
            fVar.f206865b.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(fVar.f206865b, hVar.f206819z, 0.1f);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(hVar.f206818y, fVar.f206866c);
        if (c01.e2.R(hVar.f206819z)) {
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.raw.open_im_main_logo);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            fVar.f206866c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawable, (android.graphics.drawable.Drawable) null);
        } else {
            fVar.f206866c.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(hVar.E, fVar.f206868e);
        com.tencent.mm.plugin.fts.ui.n3.a(hVar.D, fVar.f206867d);
        if (!this.f206870a.f206836e) {
            fVar.f206869f.setVisibility(8);
            return;
        }
        if (z17) {
            fVar.f206869f.setChecked(true);
            fVar.f206869f.setEnabled(false);
            fVar.f206869f.setBackgroundResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
        } else {
            fVar.f206869f.setChecked(z18);
            fVar.f206869f.setEnabled(true);
        }
        fVar.f206869f.setVisibility(0);
    }
}
