package qw3;

/* loaded from: classes3.dex */
public class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw3.i f367137d;

    public a(qw3.i iVar) {
        this.f367137d = iVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        qw3.i iVar = this.f367137d;
        g4Var.add(0, 0, 0, iVar.f367166d.getString(com.tencent.mm.R.string.aea));
        g4Var.add(0, 1, 0, iVar.f367166d.getString(com.tencent.mm.R.string.ae_));
    }
}
