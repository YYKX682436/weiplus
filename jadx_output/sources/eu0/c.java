package eu0;

/* loaded from: classes.dex */
public final class c implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f256709a;

    public c(yz5.p pVar) {
        this.f256709a = pVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "editPage onDispatch: actionName=" + str + ", data=" + obj);
        return ((java.lang.String) this.f256709a.invoke(str, obj)) != null;
    }
}
