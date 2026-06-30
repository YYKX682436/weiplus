package gf2;

/* loaded from: classes.dex */
public final class h implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f271284d;

    public h(yz5.p pVar) {
        this.f271284d = pVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>(0);
            }
            this.f271284d.invoke(0, stringArrayListExtra);
        }
    }
}
