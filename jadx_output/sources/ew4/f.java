package ew4;

/* loaded from: classes.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew4.g f257079d;

    public f(ew4.g gVar) {
        this.f257079d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ew4.g gVar = this.f257079d;
        gVar.getClass();
        gVar.execSQL("WebViewHistory", "delete from WebViewHistory where  timeStamp < " + ((java.lang.System.currentTimeMillis() / 1000) - 604800));
        int count = gVar.getCount() + (-500);
        if (count > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewHistoryStorage", "deleteItem: " + gVar.execSQL("WebViewHistory", "delete from WebViewHistory order by timeStamp limit " + count));
        }
    }
}
