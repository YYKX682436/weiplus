package rb5;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f393869d;

    public g(rb5.l lVar) {
        this.f393869d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rb5.l lVar = this.f393869d;
        lVar.onSwipe(1.0f);
        com.tencent.mm.ui.tools.TestTimeForChatting testTimeForChatting = lVar.f393885i;
        if (testTimeForChatting != null && lVar.f393882f != null) {
            testTimeForChatting.c();
        }
        lVar.f393883g.onEnterEnd();
        lVar.m();
    }
}
