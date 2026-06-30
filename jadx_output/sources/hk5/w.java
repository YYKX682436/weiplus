package hk5;

/* loaded from: classes9.dex */
public final class w extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new gd5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        java.lang.String str;
        z01.g gVar;
        java.lang.String string;
        java.lang.String q17;
        v05.b k17;
        v05.b k18;
        z05.c cVar;
        gd5.a model = (gd5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        l15.c j17 = model.j();
        java.lang.String l17 = (j17 == null || (k18 = j17.k()) == null || (cVar = (z05.c) k18.getCustom(k18.f432315e + 64)) == null) ? null : cVar.l();
        if (l17 == null || l17.length() == 0) {
            mi5.e0 e0Var = new mi5.e0();
            gd5.a aVar2 = e0Var.f326825e;
            e0Var.f326825e = model;
            e0Var.h(aVar2, model);
            android.view.View a17 = e0Var.a(getActivity());
            a17.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
            return a17;
        }
        l15.c j18 = model.j();
        z05.c cVar2 = (j18 == null || (k17 = j18.k()) == null) ? null : (z05.c) k17.getCustom(k17.f432315e + 64);
        v05.b k19 = j18 != null ? j18.k() : null;
        java.lang.String l18 = cVar2 != null ? cVar2.l() : null;
        if (l18 == null || l18.length() == 0) {
            gVar = new z01.g();
        } else {
            z01.g gVar2 = new z01.g();
            java.lang.String str2 = "";
            if (cVar2 == null || (str = cVar2.l()) == null) {
                str = "";
            }
            gVar2.f469021o = str;
            gVar2.b();
            if (cVar2 != null && (q17 = cVar2.q()) != null) {
                if (q17.length() > 0) {
                    gVar2.f469017h = q17;
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o7k));
            if (gVar2.f469019m.length() > 0) {
                sb6.append(" · ");
                sb6.append(gVar2.f469019m);
            }
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            gVar2.f469018i = sb7;
            java.lang.String str3 = gVar2.f469015f;
            if (str3.length() == 0) {
                if (k19 != null && (string = k19.getString(k19.f432315e + 14)) != null) {
                    str2 = string;
                }
                str3 = str2;
            }
            gVar2.f469015f = str3;
            gVar2.f469027u = com.tencent.mm.R.drawable.cyv;
            gVar = gVar2;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView(context, null, 0, 6, null);
        pt0.e0 e0Var2 = pt0.f0.f358209b1;
        int i17 = model.f43702d;
        com.tencent.mm.storage.f9 n17 = e0Var2.n(model.getString(i17 + 1), model.getLong(i17 + 0));
        android.content.Context context2 = chattingAskShareMvvmView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        gVar.f469026t = m11.b1.Di().m0(n17, n17.z0(), i65.a.g(context2), false);
        chattingAskShareMvvmView.setViewModel(gVar);
        l15.c j19 = model.j();
        if (j19 != null) {
            if (te5.f.f418634a.a()) {
                com.tencent.mm.mvvm.MvvmView mvvmView = chattingAskShareMvvmView.f204615g;
                if (mvvmView == null) {
                    kotlin.jvm.internal.o.o("holderNew");
                    throw null;
                }
                mvvmView.setOnClickListener(new af5.p(n17, j19));
            } else {
                em.h hVar = chattingAskShareMvvmView.f204614f;
                if (hVar == null) {
                    kotlin.jvm.internal.o.o("holder");
                    throw null;
                }
                hVar.f254360a.setOnClickListener(new af5.q(n17, j19));
            }
        }
        if (te5.f.f418634a.a()) {
            chattingAskShareMvvmView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            return chattingAskShareMvvmView;
        }
        chattingAskShareMvvmView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -2));
        return chattingAskShareMvvmView;
    }
}
