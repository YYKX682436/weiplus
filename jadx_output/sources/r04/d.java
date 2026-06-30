package r04;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr04/d;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lr04/b;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "plugin-sec-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<r04.b> {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368356h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
        this.f368356h = "MicroMsg.SecData.SecReportDataInfoStorage";
    }

    @Override // com.tencent.mm.sdk.storage.mvvm.MvvmStorage, l75.c1
    /* renamed from: O6, reason: from getter */
    public java.lang.String getF368356h() {
        return this.f368356h;
    }

    public final r04.b X6(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(dm.i4.COL_ID, id6);
        return (r04.b) T6(contentValues, kotlin.jvm.internal.i0.a(r04.b.class));
    }
}
