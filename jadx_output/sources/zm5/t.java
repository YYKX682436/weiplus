package zm5;

/* loaded from: classes3.dex */
public final class t extends com.tencent.mm.ui.component.UIComponent implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474267d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f474268e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f474269f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f474270g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f474271h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f474272i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474267d = jz5.h.b(new zm5.o(activity));
        this.f474268e = jz5.h.b(new zm5.m(activity));
        this.f474269f = jz5.h.b(new zm5.s(activity));
        this.f474270g = jz5.h.b(new zm5.r(activity));
        this.f474271h = jz5.h.b(new zm5.n(activity));
    }

    public final android.view.View O6() {
        java.lang.Object value = ((jz5.n) this.f474267d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void P6() {
        kotlinx.coroutines.r2 r2Var = this.f474272i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.view.View O6 = O6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "resetVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(O6, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "resetVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f474272i = kotlinx.coroutines.l.d(getMainScope(), kotlinx.coroutines.q1.f310570c, null, new zm5.q(this, null), 2, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        long j17 = ((zm5.l) zVar.a(activity).a(zm5.l.class)).f474238i;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        java.lang.String str = ((zm5.l) zVar.a(activity2).a(zm5.l.class)).f474239m;
        int id6 = v17.getId();
        if (id6 == com.tencent.mm.R.id.h__) {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            if (aq.p.f12930b != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "dealImageDownload: " + j17 + ' ' + str);
                com.tencent.mm.ui.chatting.gallery.k1.k(activity3, pt0.f0.f358209b1.n(str, j17), true, null);
            }
        } else if (id6 == com.tencent.mm.R.id.h_j) {
            aq.p.f12929a.a(j17, str, getActivity(), 0);
        } else if (id6 == com.tencent.mm.R.id.h_n) {
            androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            zm5.f0 f0Var = (zm5.f0) zVar.a(activity4).a(zm5.f0.class);
            zm5.x0 x0Var = f0Var.f474216r;
            zm5.x0 x0Var2 = zm5.x0.f474287e;
            if ((x0Var == x0Var2 || f0Var.f474213o == x0Var2) ? false : true) {
                androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
                kotlin.jvm.internal.o.g(activity5, "activity");
                if (((zm5.l) zVar.a(activity5).a(zm5.l.class)).O6() != null) {
                    androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
                    kotlin.jvm.internal.o.g(activity6, "activity");
                    ((zm5.f0) zVar.a(activity6).a(zm5.f0.class)).S6(j17, str);
                }
            }
        } else if (id6 == com.tencent.mm.R.id.h9g) {
            androidx.appcompat.app.AppCompatActivity activity7 = getActivity();
            kotlin.jvm.internal.o.g(activity7, "activity");
            if (aq.p.f12930b != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "dealImageToJumpGalley >> " + j17);
                com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(activity7, com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI.class);
                intent.addFlags(67108864);
                intent.putExtra("key_media_type", 1);
                intent.putExtra("kintent_talker", n17.Q0());
                intent.putExtra("key_gallery_enter_scene", 3);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(activity7, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageToJumpGalley", "(Landroid/app/Activity;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity7.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(activity7, "com/tencent/mm/ui/chatting/gallery/query/ImageQueryComposeOp", "dealImageToJumpGalley", "(Landroid/app/Activity;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        if (aq.p.f12930b != null) {
            ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            z17 = !su4.r2.l();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "getWebSearchIsToShow: " + z17);
        } else {
            z17 = false;
        }
        jz5.g gVar = this.f474269f;
        if (z17) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        boolean z18 = aq.o.f12920a;
        jz5.g gVar2 = this.f474271h;
        if (!z18) {
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            android.view.View view2 = (android.view.View) value2;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/view/activity/ImageQueryGalleryBottomFunUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup.LayoutParams layoutParams = O6().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin += i65.a.b(getActivity(), aq.p.f12930b != null ? nc5.b.f336192d : 0);
        O6().setLayoutParams(layoutParams2);
        java.lang.Object value3 = ((jz5.n) this.f474268e).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.view.View) value3).setOnClickListener(this);
        java.lang.Object value4 = ((jz5.n) this.f474270g).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.view.View) value4).setOnClickListener(this);
        java.lang.Object value5 = ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.view.View) value5).setOnClickListener(this);
        java.lang.Object value6 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        ((android.view.View) value6).setOnClickListener(this);
        P6();
    }
}
