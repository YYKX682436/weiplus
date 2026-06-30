package ox3;

/* loaded from: classes10.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final t45.i f349721d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f349722e;

    public a(t45.i exclusiveRingtoneData) {
        kotlin.jvm.internal.o.g(exclusiveRingtoneData, "exclusiveRingtoneData");
        this.f349721d = exclusiveRingtoneData;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f349721d.f415588d != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
