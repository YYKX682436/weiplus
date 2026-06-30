package db5;

/* loaded from: classes11.dex */
public class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMTagPanel f228319d;

    public d7(db5.c7 c7Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.base.MMTagPanel mMTagPanel = this.f228319d;
        if (mMTagPanel != null) {
            mMTagPanel.q();
        }
        this.f228319d = null;
    }
}
