package cw1;

/* loaded from: classes12.dex */
public class l3 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.j3 f223102a;

    public l3(cw1.j3 j3Var) {
        this.f223102a = j3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        cw1.j3 j3Var = this.f223102a;
        if (j3Var.f223031n) {
            return;
        }
        j3Var.notifyDataSetChanged();
    }
}
