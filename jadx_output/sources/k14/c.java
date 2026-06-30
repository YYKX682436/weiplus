package k14;

/* loaded from: classes7.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f303307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f303308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f303309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wd0.b f303311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.ui.widget.dialog.u3 u3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str, wd0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f303308e = u3Var;
        this.f303309f = appCompatActivity;
        this.f303310g = str;
        this.f303311h = bVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k14.c(this.f303308e, this.f303309f, this.f303310g, this.f303311h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k14.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f303307d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f303308e.dismiss();
            this.f303307d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f303309f;
            com.tencent.mm.ui.widget.dialog.o3 o3Var = new com.tencent.mm.ui.widget.dialog.o3(appCompatActivity);
            android.view.View inflate = android.view.LayoutInflater.from(appCompatActivity).inflate(com.tencent.mm.R.layout.f488152dz5, (android.view.ViewGroup) null);
            wd0.b bVar = this.f303311h;
            yz5.l lVar = bVar.f444693e;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.a9m);
            kotlin.jvm.internal.o.f(weImageView, "getAvatar(...)");
            lVar.invoke(weImageView);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k3f);
            textView.setText(bVar.f444690b);
            if (textView == null) {
                textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.k3f);
            }
            kotlin.jvm.internal.o.f(textView, "getName(...)");
            com.tencent.mm.ui.fk.b(textView);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2)).setText(bVar.f444692d);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
            textView2.setText(bVar.f444691c);
            if (textView2 == null) {
                textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
            }
            kotlin.jvm.internal.o.f(textView2, "getTitle(...)");
            com.tencent.mm.ui.fk.b(textView2);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.upx);
            kotlin.jvm.internal.o.f(textView3, "getPhoneNum(...)");
            com.tencent.mm.ui.fk.b(textView3);
            if (textView3 == null) {
                textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.upx);
            }
            java.lang.String str = this.f303310g;
            kotlin.jvm.internal.o.g(str, "<this>");
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m521constructorimpl(r26.n0.b0(str, 3, 7, "****").toString());
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                obj2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.String str2 = (java.lang.String) (kotlin.Result.m527isFailureimpl(obj2) ? null : obj2);
            if (str2 != null) {
                str = str2;
            }
            textView3.setText(str);
            android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ume);
            kotlin.jvm.internal.o.f(textView4, "getNotAllowedTips(...)");
            com.tencent.mm.ui.fk.b(textView4);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.upy);
            kotlin.jvm.internal.o.f(linearLayout, "getPhoneNumLayout(...)");
            if (textView4 == null) {
                textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ume);
            }
            kotlin.jvm.internal.o.f(textView4, "getNotAllowedTips(...)");
            o3Var.f211939b.f211807d = inflate;
            com.tencent.mm.ui.widget.dialog.z2 a17 = o3Var.a();
            a17.f212058g.setBackgroundResource(com.tencent.mm.R.drawable.b8m);
            linearLayout.setOnClickListener(new k14.e(rVar, a17));
            textView4.setOnClickListener(new k14.f(rVar, a17));
            a17.C();
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
