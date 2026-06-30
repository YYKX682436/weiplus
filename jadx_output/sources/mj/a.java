package mj;

/* loaded from: classes12.dex */
public class a implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj.i f326952d;

    public a(mj.i iVar) {
        this.f326952d = iVar;
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        mj.i.e(this.f326952d, false);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        mj.i.e(this.f326952d, true);
    }
}
