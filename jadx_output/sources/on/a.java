package on;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346726d;

    public a(on.b bVar, java.lang.String str) {
        this.f346726d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        rn.h hVar = new rn.h();
        java.lang.String str = this.f346726d;
        hVar.field_chatroomname = str;
        hVar.field_queryState = 1;
        com.tencent.mars.xlog.Log.i("ChatroomContactOnStorageChanged", "onNotifyChange username:%s result:%s", str, java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().insert(hVar)));
    }
}
