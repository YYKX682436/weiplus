package or4;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.c f347696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(or4.c cVar) {
        super(1);
        this.f347696d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.text.Editable text = ((com.tenpay.android.wechat.TenpaySecureEditText) it.findViewById(com.tencent.mm.R.id.pbn)).getText();
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(text);
        or4.c cVar = this.f347696d;
        if (J0) {
            return java.lang.String.valueOf(cVar.getString(com.tencent.mm.R.string.kfl));
        }
        return cVar.getString(com.tencent.mm.R.string.kfl) + ",¥" + ((java.lang.Object) text);
    }
}
