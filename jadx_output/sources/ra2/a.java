package ra2;

/* loaded from: classes2.dex */
public final class a extends java.util.Observable {

    /* renamed from: a, reason: collision with root package name */
    public int f393483a;

    public a(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f393483a = (i18 & 1) != 0 ? 0 : i17;
    }

    public final void a(int i17) {
        this.f393483a = i17;
        setChanged();
    }
}
