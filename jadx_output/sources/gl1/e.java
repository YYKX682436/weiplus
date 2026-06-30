package gl1;

/* loaded from: classes7.dex */
public class e extends gl1.f implements gl1.a {

    /* renamed from: e, reason: collision with root package name */
    public sd1.c f272795e;

    /* renamed from: f, reason: collision with root package name */
    public c01.l2 f272796f;

    public e(android.content.Context context) {
        super(context);
        this.f272795e = null;
    }

    @Override // gl1.a
    public c01.l2 getKeyValueSet() {
        return this.f272796f;
    }

    @Override // sd1.b
    public sd1.c getReferrerPolicy() {
        return this.f272795e;
    }

    @Override // gl1.a
    public android.view.View getView() {
        return this;
    }

    @Override // gl1.c
    public void setImageByteArray(byte[] bArr) {
    }

    public void setImageFilePath(java.lang.String str) {
    }

    public void setInterceptEvent(boolean z17) {
        this.f272797d = z17;
    }

    @Override // gl1.a
    public void setKeyValueSet(c01.l2 l2Var) {
        this.f272796f = l2Var;
    }

    @Override // sd1.b
    public void setReferrerPolicy(sd1.c cVar) {
        this.f272795e = cVar;
    }
}
