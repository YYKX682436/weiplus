package gx0;

/* loaded from: classes5.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f276349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.Segment f276350e;

    public e(yz5.l lVar, com.tencent.maas.moviecomposing.segments.Segment segment) {
        this.f276349d = lVar;
        this.f276350e = segment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f276349d.invoke(this.f276350e);
    }
}
