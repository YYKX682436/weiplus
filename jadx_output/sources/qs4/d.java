package qs4;

/* loaded from: classes9.dex */
public class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs4.f f366415d;

    public d(qs4.f fVar) {
        this.f366415d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BindCardProcess", "NetSceneTenpayBindBankcard dialog lOk");
        qs4.f fVar = this.f366415d;
        fVar.f338834b.d(new rs4.a(fVar.f366416c, "1", ""), true);
        at4.y0.a(1);
    }
}
