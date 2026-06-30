package l41;

/* loaded from: classes8.dex */
public final class f2 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f315814d;

    public f2(com.tencent.mm.ui.da daVar) {
        this.f315814d = daVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.da daVar = this.f315814d;
        if (daVar != null) {
            daVar.mmOnActivityResult(i17, i18, intent);
        }
    }
}
