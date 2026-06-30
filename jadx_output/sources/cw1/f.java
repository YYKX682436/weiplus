package cw1;

/* loaded from: classes12.dex */
public final class f extends ot1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f222925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f222926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot1.h f222927g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.database.Cursor cursor, java.util.HashSet hashSet, int[] iArr, ot1.h hVar) {
        super(cursor);
        this.f222925e = hashSet;
        this.f222926f = iArr;
        this.f222927g = hVar;
    }

    @Override // ot1.g
    public java.lang.Object j(android.database.Cursor cursor) {
        kotlin.jvm.internal.o.g(cursor, "cursor");
        ot1.h hVar = new ot1.h();
        hVar.convertFrom(cursor);
        java.lang.String b17 = ot1.d.b(hVar.field_username);
        hVar.field_username = b17;
        if ((hVar.field_flags & 1) != 0) {
            this.f222925e.add(new jz5.l(b17, java.lang.Long.valueOf(hVar.field_msgId)));
        }
        return ot1.h.w0(this.f222926f, hVar.field_msgSubType) ? hVar : this.f222927g;
    }
}
