package jv0;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView f302203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.duration.DurationModifyTimelineView durationModifyTimelineView) {
        super(0);
        this.f302202d = context;
        this.f302203e = durationModifyTimelineView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hy0.y yVar = new hy0.y(this.f302202d);
        yVar.f286017a = new jv0.m(this.f302203e);
        return yVar;
    }
}
