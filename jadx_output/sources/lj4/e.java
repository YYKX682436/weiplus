package lj4;

/* loaded from: classes11.dex */
public final class e implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f318983d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f318984e;

    public e(java.lang.String str, java.util.ArrayList doWhatItemList) {
        kotlin.jvm.internal.o.g(doWhatItemList, "doWhatItemList");
        this.f318983d = str;
        this.f318984e = doWhatItemList;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 3;
    }
}
