package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public final class ab extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.db f198372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(com.tencent.mm.ui.chatting.db dbVar) {
        super(0);
        this.f198372d = dbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f198372d.getIntent();
        kotlin.jvm.internal.o.g(intent, "<this>");
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("key_HalfScreenActionReceiver");
        android.os.ResultReceiver resultReceiver = parcelableExtra instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra : null;
        if (resultReceiver != null) {
            return new ah5.b(resultReceiver);
        }
        return null;
    }
}
