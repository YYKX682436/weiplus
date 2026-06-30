package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ew extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f118287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew(androidx.appcompat.app.AppCompatActivity appCompatActivity, java.util.List list, com.tencent.mm.plugin.finder.live.widget.nw nwVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118287d = appCompatActivity;
        this.f118288e = list;
        this.f118289f = nwVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.ew(this.f118287d, this.f118288e, this.f118289f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.ew ewVar = (com.tencent.mm.plugin.finder.live.widget.ew) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ewVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.vc startActivityForResult;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_ALIAS_VISITOR_NICKNAME", "");
        intent.putExtra("KEY_ALIAS_VISITOR_AVATAR", "");
        intent.putExtra("KEY_SOURCE", 1);
        com.tencent.mm.plugin.finder.live.widget.dw dwVar = new com.tencent.mm.plugin.finder.live.widget.dw(this.f118288e, this.f118289f);
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
        androidx.appcompat.app.AppCompatActivity context = this.f118287d;
        kotlin.jvm.internal.o.g(context, "context");
        jz2.x0 x0Var = jz2.x0.f302754a;
        intent.setClass(context, (java.lang.Class) ((jz5.n) jz2.x0.f302763j).getValue());
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
        if (mMFragmentActivity != null && (startActivityForResult = mMFragmentActivity.startActivityForResult(intent)) != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = dwVar;
        }
        return jz5.f0.f302826a;
    }
}
