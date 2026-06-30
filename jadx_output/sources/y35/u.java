package y35;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f459257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f459258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y35.z f459259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y35.r f459260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.Object obj, android.view.View view, y35.z zVar, y35.r rVar) {
        super(2);
        this.f459257d = obj;
        this.f459258e = view;
        this.f459259f = zVar;
        this.f459260g = rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        boolean b17 = kotlin.jvm.internal.o.b(this.f459257d, this.f459258e.getTag());
        if (b17) {
            y35.z zVar = this.f459259f;
            android.view.View view = (android.view.View) ((jz5.n) zVar.f459268d).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1", "invoke", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/preference/FMessageSayHiImgHolder$bindData$1", "invoke", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (bitmap != null) {
                jz5.g gVar = zVar.f459266b;
                ((android.widget.ImageView) ((jz5.n) gVar).getValue()).setImageBitmap(bitmap);
                if (!android.text.TextUtils.isEmpty(str)) {
                    ((android.widget.ImageView) ((jz5.n) gVar).getValue()).setOnClickListener(new y35.t(zVar, this.f459260g, str));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FMessageSayHiImgHolder", "getBitmap fail, bitmap is null:%s isTagValid:%s", java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(b17));
            }
        }
        return jz5.f0.f302826a;
    }
}
