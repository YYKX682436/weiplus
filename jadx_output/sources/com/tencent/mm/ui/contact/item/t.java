package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class t implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final rd0.y0 f206933a;

    public t(com.tencent.mm.ui.contact.item.u uVar) {
        ((qd0.e) ((rd0.x0) i95.n0.c(rd0.x0.class))).getClass();
        this.f206933a = new com.tencent.mm.ui.contact.item.z(uVar);
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        com.tencent.mm.ui.contact.item.u uVar = ((com.tencent.mm.ui.contact.item.z) this.f206933a).f206949a;
        android.view.View inflate = (uVar == null || !uVar.f206842k) ? i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck6, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487876ad, viewGroup, false);
        com.tencent.mm.ui.contact.item.s sVar = uVar.f206935J;
        sVar.f206924b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        sVar.f206925c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        sVar.f206926d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        sVar.f206923a = inflate.findViewById(com.tencent.mm.R.id.mjc);
        if (uVar.f206842k) {
            sVar.f206931i = inflate.findViewById(com.tencent.mm.R.id.mjb);
        }
        sVar.f206927e = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.mie);
        sVar.f206928f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.mk7);
        sVar.f206929g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kjo);
        sVar.f206930h = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f483892cd3);
        inflate.setTag(sVar);
        if (uVar.f206834c) {
            android.content.res.Resources resources = sVar.f206925c.getContext().getResources();
            sVar.f206923a.setBackgroundResource(com.tencent.mm.R.drawable.f481308q4);
            sVar.f206925c.setTextColor(resources.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            sVar.f206926d.setTextColor(resources.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            sVar.f206927e.setBackgroundResource(com.tencent.mm.R.drawable.awt);
        }
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        com.tencent.mm.ui.contact.item.z zVar = (com.tencent.mm.ui.contact.item.z) this.f206933a;
        zVar.getClass();
        if (dVar.f206842k && zVar.a(dVar)) {
            return false;
        }
        com.tencent.mm.ui.contact.item.u uVar = zVar.f206949a;
        if (uVar.C == null) {
            return false;
        }
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(uVar.f206848q, uVar.C, 1);
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        com.tencent.mm.ui.contact.item.z zVar = (com.tencent.mm.ui.contact.item.z) this.f206933a;
        zVar.getClass();
        com.tencent.mm.ui.contact.item.s sVar = (com.tencent.mm.ui.contact.item.s) bVar;
        com.tencent.mm.ui.contact.item.u uVar = (com.tencent.mm.ui.contact.item.u) dVar;
        java.lang.String str = uVar.f206819z;
        if (str == null || str.length() <= 0) {
            sVar.f206924b.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(sVar.f206924b, uVar.f206819z, 0.1f);
        }
        if (dVar.f206842k && c01.z1.r().equals(uVar.f206819z)) {
            uVar.f206818y = ((java.lang.Object) uVar.f206818y) + context.getString(com.tencent.mm.R.string.ieq);
        }
        com.tencent.mm.ui.contact.item.u uVar2 = zVar.f206949a;
        uVar2.getClass();
        if (!com.tencent.mm.storage.z3.m4(uVar.f206819z) || com.tencent.mm.sdk.platformtools.t8.K0(uVar.E)) {
            com.tencent.mm.plugin.fts.ui.n3.a(uVar.f206818y, sVar.f206925c);
        }
        com.tencent.mm.plugin.fts.ui.n3.a(uVar.D, sVar.f206926d);
        if (uVar2.f206836e) {
            if (uVar2.f206834c) {
                sVar.f206927e.setBackgroundResource(com.tencent.mm.R.drawable.aoh);
            } else {
                sVar.f206927e.setBackgroundResource(com.tencent.mm.R.drawable.aoe);
            }
            if (z17) {
                sVar.f206927e.setChecked(true);
                sVar.f206927e.setEnabled(false);
            } else if ((dVar.f206842k && zVar.a(uVar)) || uVar.f206847p) {
                sVar.f206927e.setChecked(false);
                sVar.f206927e.setEnabled(false);
            } else {
                sVar.f206927e.setChecked(z18);
                sVar.f206927e.setEnabled(true);
            }
            sVar.f206927e.setVisibility(0);
        } else if (uVar2.f206838g) {
            sVar.f206927e.setBackgroundResource(com.tencent.mm.R.drawable.axu);
            if (z17) {
                sVar.f206927e.setChecked(true);
                sVar.f206927e.setEnabled(false);
            } else {
                sVar.f206927e.setChecked(z18);
                sVar.f206927e.setEnabled(true);
            }
            sVar.f206927e.setVisibility(0);
        } else if (uVar2.f206839h) {
            sVar.f206927e.setVisibility(8);
            android.widget.ImageView imageView = sVar.f206928f;
            if (imageView != null) {
                if (z18) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            sVar.f206927e.setVisibility(8);
        }
        if (uVar2.F) {
            sVar.f206927e.setVisibility(8);
            android.widget.ImageView imageView2 = sVar.f206928f;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        if (uVar2.f206840i) {
            if (dVar.f206842k) {
                sVar.f206931i.setBackgroundResource(com.tencent.mm.R.drawable.f480665t);
            } else {
                sVar.f206923a.setBackgroundResource(com.tencent.mm.R.drawable.f481310q6);
            }
        } else if (dVar.f206842k) {
            sVar.f206931i.setBackgroundResource(com.tencent.mm.R.drawable.f480665t);
        } else {
            sVar.f206923a.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        }
        if (uVar.B.F0() == 1) {
            sVar.f206926d.setVisibility(0);
            sVar.f206926d.setText(context.getString(com.tencent.mm.R.string.ieo));
        }
        if (dVar.f206842k) {
            sVar.f206926d.post(new com.tencent.mm.ui.contact.item.w(zVar, sVar, context));
            java.lang.String str2 = dVar.f206837f;
            if (uVar.B.F0() == 1) {
                sVar.f206926d.setVisibility(0);
                sVar.f206926d.setText(context.getString(com.tencent.mm.R.string.ieo));
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                sVar.f206926d.setVisibility(8);
            } else {
                sVar.f206926d.setVisibility(0);
                sVar.f206926d.setText(str2);
            }
        }
        android.widget.TextView textView = sVar.f206929g;
        if (textView != null) {
            textView.setVisibility(8);
            if (com.tencent.mm.storage.z3.m4(uVar.f206819z) && !com.tencent.mm.sdk.platformtools.t8.K0(uVar.E)) {
                sVar.f206925c.post(new com.tencent.mm.ui.contact.item.x(zVar, sVar, uVar, context));
            }
            if (sVar.f206930h != null) {
                if (!uVar2.G || com.tencent.mm.sdk.platformtools.t8.K0(uVar.f206819z)) {
                    sVar.f206930h.setVisibility(8);
                } else {
                    sVar.f206930h.setVisibility(0);
                    sVar.f206930h.setOnClickListener(new com.tencent.mm.ui.contact.item.y(zVar, uVar, context));
                }
            }
        }
        if ((dVar.f206842k && zVar.a(uVar)) || uVar.f206847p) {
            sVar.f206924b.setAlpha(0.3f);
            sVar.f206925c.setAlpha(0.3f);
            sVar.f206926d.setAlpha(0.3f);
            sVar.f206927e.setAlpha(0.3f);
            android.widget.ImageView imageView3 = sVar.f206930h;
            if (imageView3 != null) {
                imageView3.setAlpha(0.3f);
            }
            android.widget.TextView textView2 = sVar.f206929g;
            if (textView2 != null) {
                textView2.setAlpha(0.3f);
                return;
            }
            return;
        }
        sVar.f206924b.setAlpha(1.0f);
        sVar.f206925c.setAlpha(1.0f);
        sVar.f206926d.setAlpha(1.0f);
        sVar.f206927e.setAlpha(1.0f);
        android.widget.ImageView imageView4 = sVar.f206930h;
        if (imageView4 != null) {
            imageView4.setAlpha(1.0f);
        }
        android.widget.TextView textView3 = sVar.f206929g;
        if (textView3 != null) {
            textView3.setAlpha(1.0f);
        }
    }
}
