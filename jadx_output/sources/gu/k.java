package gu;

/* loaded from: classes9.dex */
public final class k extends st.a {

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f275614q;

    /* renamed from: r, reason: collision with root package name */
    public final l15.c f275615r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f275616s;

    /* renamed from: t, reason: collision with root package name */
    public oi3.g f275617t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f275618u;

    /* renamed from: v, reason: collision with root package name */
    public oi3.g f275619v;

    /* renamed from: w, reason: collision with root package name */
    public s15.w f275620w;

    /* renamed from: x, reason: collision with root package name */
    public v05.b f275621x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String toUsername, l15.c recordMsgXmlObj) {
        super(toUsername, recordMsgXmlObj, null);
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(recordMsgXmlObj, "recordMsgXmlObj");
        this.f275614q = toUsername;
        this.f275615r = recordMsgXmlObj;
        this.f275616s = "send_record_msg";
    }

    @Override // st.a
    public java.lang.String a() {
        return this.f275616s;
    }
}
