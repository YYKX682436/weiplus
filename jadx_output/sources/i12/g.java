package i12;

/* loaded from: classes15.dex */
public class g extends j12.b {
    @Override // j12.b
    public int c() {
        return 0;
    }

    @Override // j12.b
    public int f() {
        return 0;
    }

    @Override // j12.b
    public boolean g(int i17) {
        return false;
    }

    @Override // j12.b
    public android.view.View j(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        i12.f fVar = (i12.f) view.getTag();
        j12.i item = getItem(i17);
        if (fVar != null && item != null) {
            item.f297173h = false;
            item.f297174i = false;
            r45.zj0 zj0Var = item.f297167b;
            if (zj0Var != null) {
                fVar.f287176h.setText(zj0Var.f392130f);
                int i18 = zj0Var.f392134m;
                if (fVar.f287178j != null) {
                    if (!(j12.g.b(i18, 4) || j12.g.b(i18, 8))) {
                        fVar.f287178j.setText(fVar.f287194z.getString(com.tencent.mm.R.string.j5e));
                        n11.a b17 = n11.a.b();
                        java.lang.String str = zj0Var.f392129e;
                        b17.h(str, fVar.f287174f, y12.f.b(zj0Var.f392128d, str));
                        fVar.f287179k.setText(k35.m1.g("yyyy-MM-dd", zj0Var.f392139r * 1000));
                    }
                }
                android.widget.TextView textView = fVar.f287178j;
                if (textView != null) {
                    textView.setText("");
                }
                n11.a b172 = n11.a.b();
                java.lang.String str2 = zj0Var.f392129e;
                b172.h(str2, fVar.f287174f, y12.f.b(zj0Var.f392128d, str2));
                fVar.f287179k.setText(k35.m1.g("yyyy-MM-dd", zj0Var.f392139r * 1000));
            }
        }
        return view;
    }

    @Override // j12.b
    public int k() {
        return 0;
    }

    @Override // j12.b
    public i12.c l(android.content.Context context, android.view.View view) {
        i12.f fVar = new i12.f(this, context, view);
        com.tencent.mm.plugin.emoji.model.h0 h0Var = this.f297153f;
        com.tencent.mm.ui.widget.button.WeButton weButton = fVar.f287183o;
        if (weButton != null) {
            weButton.setOnClickListener(new i12.a(fVar, h0Var));
        }
        com.tencent.mm.ui.widget.button.WeButton weButton2 = fVar.f287185q;
        if (weButton2 != null) {
            weButton2.setOnClickListener(new i12.b(fVar, h0Var));
        }
        return fVar;
    }

    @Override // j12.b
    public void o(int i17) {
    }

    @Override // j12.b
    public void p(int i17) {
    }

    @Override // j12.b
    public void q(int i17) {
    }
}
