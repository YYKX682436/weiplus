package io.flutter.embedding.engine;

@qz5.f(c = "io.flutter.embedding.engine.MMFlutterEngineGroup", f = "MMFlutterEngineGroup.kt", l = {150, 176, 184}, m = "createAndRunEngineAsync")
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MMFlutterEngineGroup$createAndRunEngineAsync$1 extends qz5.d {
    long J$0;
    long J$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.flutter.embedding.engine.MMFlutterEngineGroup this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup$createAndRunEngineAsync$1(io.flutter.embedding.engine.MMFlutterEngineGroup mMFlutterEngineGroup, kotlin.coroutines.Continuation<? super io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$1> continuation) {
        super(continuation);
        this.this$0 = mMFlutterEngineGroup;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createAndRunEngineAsync(null, this);
    }
}
