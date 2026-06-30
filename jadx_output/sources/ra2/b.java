package ra2;

/* loaded from: classes2.dex */
public final class b implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.bo6 f393484d;

    /* renamed from: e, reason: collision with root package name */
    public final ra2.a f393485e;

    public b(r45.bo6 tab, ra2.a commonInfo) {
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(commonInfo, "commonInfo");
        this.f393484d = tab;
        this.f393485e = commonInfo;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f393484d.getInteger(1);
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
