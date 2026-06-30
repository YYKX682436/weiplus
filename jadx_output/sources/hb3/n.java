package hb3;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ up5.b0 f280129d;

    public n(hb3.o oVar, up5.b0 b0Var) {
        this.f280129d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.wcdb.core.Table table = rb3.d.f393855a;
        up5.b0 item = this.f280129d;
        kotlin.jvm.internal.o.g(item, "item");
        rb3.d.f393855a.insertOrReplaceObject(item);
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreLuckyMoney", "[doSaveFullCoverInfoDetail] save data success");
    }
}
