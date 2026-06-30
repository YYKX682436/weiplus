package qe5;

/* loaded from: classes9.dex */
public final class o extends wm3.a implements qi3.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f362159d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f362160e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f362161f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f362162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362159d = jz5.h.b(new qe5.k(this));
        this.f362160e = jz5.h.b(new qe5.m(this));
        this.f362161f = jz5.h.b(new qe5.n(this));
    }

    @Override // qi3.a0
    public void L8(qi3.e0 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
        if (msgIdTalker != null) {
            if (!(msgIdTalker.f149480d == U6() && kotlin.jvm.internal.o.b(msgIdTalker.a(), (java.lang.String) ((jz5.n) this.f362160e).getValue()))) {
                msgIdTalker = null;
            }
            if (msgIdTalker != null) {
                pm0.v.X(new qe5.l(this, event));
            }
        }
    }

    public final boolean T6(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String U1;
        if (f9Var == null || f9Var.A0() != 1 || (U1 = f9Var.U1()) == null) {
            return false;
        }
        if (!(f9Var.I0() == 0 || r26.n0.B(U1, java.lang.String.valueOf(f9Var.I0()), false))) {
            U1 = null;
        }
        if (U1 == null) {
            return false;
        }
        com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(U6(), (java.lang.String) ((jz5.n) this.f362160e).getValue());
        return J0 == null || !com.tencent.mm.vfs.w6.j(J0.field_fileFullPath) || com.tencent.mm.vfs.w6.k(J0.field_fileFullPath) < J0.field_totalLen;
    }

    public final long U6() {
        return ((java.lang.Number) ((jz5.n) this.f362159d).getValue()).longValue();
    }

    public final em.d0 V6() {
        return (em.d0) ((jz5.n) this.f362161f).getValue();
    }

    public final void W6() {
        jz5.f0 f0Var;
        if (this.f362162g) {
            Y6();
            return;
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k((java.lang.String) ((jz5.n) this.f362160e).getValue(), U6());
        if (k17 != null) {
            if (k17.P0() < 2) {
                Y6();
            } else {
                X6();
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            X6();
        }
    }

    public final void X6() {
        V6().z().setVisibility(8);
        V6().y().setVisibility(8);
        android.widget.Button w17 = V6().w();
        if (w17 == null) {
            return;
        }
        w17.setVisibility(0);
    }

    public final void Y6() {
        V6().z().setVisibility(0);
        V6().y().setVisibility(0);
        android.widget.Button w17 = V6().w();
        if (w17 == null) {
            return;
        }
        w17.setVisibility(8);
    }

    public final void Z6(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        java.lang.String str2;
        v05.a aVar;
        v05.a aVar2;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(U6(), (java.lang.String) ((jz5.n) this.f362160e).getValue());
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.vkl);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t4v);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/uic/file/AppAttachUploadUIC", "initUploadingUI", "(Lcom/tencent/mm/storage/MsgInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.vks);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vkn);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vko);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vkp);
        com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) findViewById(com.tencent.mm.R.id.vkr);
        l15.c cVar = new l15.c();
        if (f9Var == null || (str = f9Var.U1()) == null) {
            str = "";
        }
        cVar.fromXml(str);
        v05.b k17 = cVar.k();
        if (k17 == null || (aVar2 = (v05.a) k17.getCustom(k17.f432315e + 8)) == null || (str2 = aVar2.r()) == null) {
            str2 = "";
        }
        if (((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(str2)) {
            if (imageView != null) {
                ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).getClass();
                imageView.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.voice_default_dark : com.tencent.mm.R.raw.voice_default_light);
            }
        } else if (imageView != null) {
            i95.m c17 = i95.n0.c(pt.m0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            imageView.setImageResource(pt.m0.oa((pt.m0) c17, false, str2, false, false, 12, null));
        }
        if (textView != null) {
            java.lang.String g17 = ez.v0.f257777a.g(cVar.k());
            if (g17 == null) {
                g17 = getString(com.tencent.mm.R.string.f492674hf5);
            }
            textView.setText(g17);
        }
        if (textView2 != null) {
            android.content.res.Resources resources = getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            v05.b k18 = cVar.k();
            objArr[0] = com.tencent.mm.sdk.platformtools.t8.f0((k18 == null || (aVar = (v05.a) k18.getCustom(k18.f432315e + 8)) == null) ? 0L : aVar.getLong(aVar.f368364d + 0));
            textView2.setText(resources.getString(com.tencent.mm.R.string.cfc, objArr));
        }
        java.lang.Float f17 = (java.lang.Float) ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).aj().get(msgIdTalker.toString());
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        if (roundProgressBtn != null) {
            roundProgressBtn.setHasPause(false);
        }
        if (roundProgressBtn != null) {
            roundProgressBtn.setProgress((int) floatValue);
        }
        if (textView3 != null) {
            textView3.setText(getString(com.tencent.mm.R.string.f490433mv3));
        }
        if (f9Var != null) {
            this.f362162g = te5.h.f418649a.d(f9Var) == 1;
        }
        V6().z().setHasPause(true);
        V6().z().setOnClickListener(new qe5.i(f9Var));
        V6().w().setOnClickListener(new qe5.j(f9Var));
        W6();
        if (f9Var != null) {
            v05.b bVar = new v05.b();
            java.lang.String j17 = f9Var.j();
            bVar.fromXml(j17 != null ? j17 : "");
            em.d0 V6 = V6();
            if (V6.f254200i == null) {
                V6.f254200i = (android.widget.TextView) V6.f254192a.findViewById(com.tencent.mm.R.id.vko);
            }
            V6.f254200i.setVisibility(0);
            em.d0 V62 = V6();
            if (V62.f254200i == null) {
                V62.f254200i = (android.widget.TextView) V62.f254192a.findViewById(com.tencent.mm.R.id.vko);
            }
            android.widget.TextView textView4 = V62.f254200i;
            android.content.res.Resources resources2 = getContext().getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            v05.a aVar3 = (v05.a) bVar.getCustom(bVar.f432315e + 8);
            objArr2[0] = com.tencent.mm.sdk.platformtools.t8.f0(aVar3 != null ? aVar3.getLong(aVar3.f368364d + 0) : 0L);
            textView4.setText(resources2.getString(com.tencent.mm.R.string.cfc, objArr2));
        }
        com.tencent.mm.ui.bk.s0(V6().w().getPaint());
        em.d0 V63 = V6();
        if (V63.f254212u == null) {
            V63.f254212u = (android.widget.TextView) V63.f254192a.findViewById(com.tencent.mm.R.id.vkn);
        }
        android.text.TextPaint paint = V63.f254212u.getPaint();
        if (paint == null) {
            return;
        }
        paint.setFakeBoldText(true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).Zi(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).fj(this);
    }
}
