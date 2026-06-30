package db5;

/* loaded from: classes15.dex */
public class n8 extends db5.y7 {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f228449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMViewPager f228450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        super(mMViewPager);
        this.f228450c = mMViewPager;
        this.f228449b = new float[9];
    }

    @Override // db5.y7
    public void a() {
        this.f228450c.F.post(new db5.m8(this));
    }
}
