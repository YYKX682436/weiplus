package i53;

/* loaded from: classes8.dex */
public class b4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.d4 f288527d;

    public b4(i53.d4 d4Var) {
        this.f288527d = d4Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = 0;
        while (true) {
            i53.d4 d4Var = this.f288527d;
            if (i17 >= d4Var.f288561d.f140089m.size()) {
                return;
            }
            com.tencent.mm.plugin.game.api.GameShareOption gameShareOption = (com.tencent.mm.plugin.game.api.GameShareOption) d4Var.f288561d.f140089m.valueAt(i17);
            g4Var.f(gameShareOption.f138694d, gameShareOption.f138695e);
            i17++;
        }
    }
}
