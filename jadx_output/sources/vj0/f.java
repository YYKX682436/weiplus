package vj0;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f437646d;

    public f(yz5.l lVar) {
        this.f437646d = lVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            java.lang.String string = bundle.getString("BUNDLE_KEY_LAST_INFO");
            if (!(string == null || string.length() == 0)) {
                vj0.i iVar = vj0.i.f437649a;
                w15.a aVar = new w15.a();
                vj0.i.f437650b = aVar;
                aVar.fromXml(string);
            }
            this.f437646d.invoke(bundle);
        }
    }
}
