package qx5;

/* loaded from: classes13.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx5.r f367508d;

    public p(qx5.r rVar) {
        this.f367508d = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        cy5.t tVar;
        qx5.r rVar = this.f367508d;
        if (rVar.f367510a || (tVar = rVar.f367515f.f224895c) == null) {
            return;
        }
        tVar.o(4, -1);
    }
}
