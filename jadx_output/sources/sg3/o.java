package sg3;

/* loaded from: classes4.dex */
public class o implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407981b;

    public o(sg3.r rVar, java.lang.String str, java.lang.String str2) {
        this.f407980a = str;
        this.f407981b = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
        openIMSucceedContactLogStruct.p(this.f407980a);
        openIMSucceedContactLogStruct.q(this.f407981b);
        openIMSucceedContactLogStruct.f59797f = 1L;
        openIMSucceedContactLogStruct.f59798g = 1L;
        openIMSucceedContactLogStruct.f59800i = 1L;
        openIMSucceedContactLogStruct.k();
    }
}
