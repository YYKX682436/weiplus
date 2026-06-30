package x;

/* loaded from: classes13.dex */
public class b extends x.n implements java.util.Map {

    /* renamed from: n, reason: collision with root package name */
    public x.m f450806n;

    public b(x.n nVar) {
        if (nVar != null) {
            i(nVar);
        }
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        if (this.f450806n == null) {
            this.f450806n = new x.a(this);
        }
        x.m mVar = this.f450806n;
        if (mVar.f450837a == null) {
            mVar.f450837a = new x.i(mVar);
        }
        return mVar.f450837a;
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        if (this.f450806n == null) {
            this.f450806n = new x.a(this);
        }
        x.m mVar = this.f450806n;
        if (mVar.f450838b == null) {
            mVar.f450838b = new x.j(mVar);
        }
        return mVar.f450838b;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        b(this.f450846f + map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public java.util.Collection values() {
        if (this.f450806n == null) {
            this.f450806n = new x.a(this);
        }
        x.m mVar = this.f450806n;
        if (mVar.f450839c == null) {
            mVar.f450839c = new x.l(mVar);
        }
        return mVar.f450839c;
    }
}
