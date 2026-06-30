package db5;

/* loaded from: classes15.dex */
public class j8 extends db5.y7 {

    /* renamed from: b, reason: collision with root package name */
    public final float[] f228411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMViewPager f228412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(com.tencent.mm.ui.base.MMViewPager mMViewPager) {
        super(mMViewPager);
        this.f228412c = mMViewPager;
        this.f228411b = new float[9];
    }

    @Override // db5.y7
    public void a() {
        this.f228412c.F.post(new db5.i8(this));
    }
}
