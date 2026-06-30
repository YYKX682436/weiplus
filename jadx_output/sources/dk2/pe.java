package dk2;

/* loaded from: classes.dex */
public final class pe implements ek2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233925a;

    public pe(java.lang.String str) {
        this.f233925a = str;
    }

    @Override // ek2.l
    public void a(int i17, int i18, java.lang.String str, r45.tn1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "closeLinkMic when release live. errCode:" + i18 + ", errType:" + i17 + " sessionId: " + this.f233925a);
    }
}
