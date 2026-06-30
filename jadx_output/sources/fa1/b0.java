package fa1;

/* loaded from: classes4.dex */
public class b0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f260674b;

    public b0(int i17, int i18) {
        this.f260673a = i17;
        this.f260674b = i18;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mars.xlog.Log.i("WAGameMISSignatureManager", "uploadSingleSlice: slice %d/%d, err=%d,%d,%s", java.lang.Integer.valueOf(this.f260673a), java.lang.Integer.valueOf(this.f260674b), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }
}
