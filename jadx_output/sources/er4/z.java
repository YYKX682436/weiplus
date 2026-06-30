package er4;

/* loaded from: classes16.dex */
public enum z implements com.tencent.mm.protobuf.h {
    ACTION_TYPE_INCOMING_SHOW_NOTIFICATION(1),
    ACTION_TYPE_INCOMING_SHOW_CALLKIT(2),
    ACTION_TYPE_INCOMING_SHOW_CARD(3),
    ACTION_TYPE_SHOW_MAIN_TALK_VIEW(4),
    ACTION_TYPE_CAMERA_STARTUP_BEGIN(5),
    ACTION_TYPE_CAMERA_FIRST_CALLBACK(6),
    ACTION_TYPE_SHOW_LOCAL_FIRST_PICTURE(7),
    ACTION_TYPE_SHOW_REMOTE_FIRST_PICTURE(8),
    ACTION_TYPE_AUDIO_RECORDER_STARTUP_BEGIN(9),
    ACTION_TYPE_AUDIO_RECORDER_STARTUP_SUCC(10),
    ACTION_TYPE_AUDIO_RECORDER_FIRST_CALLBACK(11),
    ACTION_TYPE_AUDIO_PLAYER_STARTUP_BEGIN(12),
    ACTION_TYPE_AUDIO_PLAYER_FIRST_CALLBACK(13),
    ACTION_TYPE_AUDIO_OCCUPY_BEGIN(14),
    ACTION_TYPE_AUDIO_OCCUPY_END(15);


    /* renamed from: d, reason: collision with root package name */
    public final int f256228d;

    z(int i17) {
        this.f256228d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f256228d;
    }
}
