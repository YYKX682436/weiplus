package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class KeyEmbedderResponder implements io.flutter.embedding.android.KeyboardManager.Responder {
    private static final java.lang.String TAG = "KeyEmbedderResponder";
    private final io.flutter.plugin.common.BinaryMessenger messenger;
    private final java.util.HashMap<java.lang.Long, java.lang.Long> pressingRecords = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.Long, io.flutter.embedding.android.KeyboardMap.TogglingGoal> togglingGoals = new java.util.HashMap<>();
    private final io.flutter.embedding.android.KeyboardManager.CharacterCombiner characterCombiner = new io.flutter.embedding.android.KeyboardManager.CharacterCombiner();

    /* renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[io.flutter.embedding.android.KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[io.flutter.embedding.android.KeyData.Type.kDown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[io.flutter.embedding.android.KeyData.Type.kUp.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[io.flutter.embedding.android.KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public KeyEmbedderResponder(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        this.messenger = binaryMessenger;
        for (io.flutter.embedding.android.KeyboardMap.TogglingGoal togglingGoal : io.flutter.embedding.android.KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(java.lang.Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    private static io.flutter.embedding.android.KeyData.Type getEventType(android.view.KeyEvent keyEvent) {
        boolean z17 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z17 ? io.flutter.embedding.android.KeyData.Type.kRepeat : io.flutter.embedding.android.KeyData.Type.kDown;
        }
        if (action == 1) {
            return io.flutter.embedding.android.KeyData.Type.kUp;
        }
        throw new java.lang.AssertionError("Unexpected event type");
    }

    private java.lang.Long getLogicalKey(android.view.KeyEvent keyEvent) {
        java.lang.Long l17 = io.flutter.embedding.android.KeyboardMap.keyCodeToLogical.get(java.lang.Long.valueOf(keyEvent.getKeyCode()));
        return l17 != null ? l17 : java.lang.Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), io.flutter.embedding.android.KeyboardMap.kAndroidPlane));
    }

    private java.lang.Long getPhysicalKey(android.view.KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return java.lang.Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), io.flutter.embedding.android.KeyboardMap.kAndroidPlane));
        }
        java.lang.Long l17 = io.flutter.embedding.android.KeyboardMap.scanCodeToPhysical.get(java.lang.Long.valueOf(scanCode));
        return l17 != null ? l17 : java.lang.Long.valueOf(keyOfPlane(keyEvent.getScanCode(), io.flutter.embedding.android.KeyboardMap.kAndroidPlane));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145 A[LOOP:2: B:61:0x013f->B:63:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean handleEventImpl(android.view.KeyEvent r18, io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.KeyEmbedderResponder.handleEventImpl(android.view.KeyEvent, io.flutter.embedding.android.KeyboardManager$Responder$OnKeyEventHandledCallback):boolean");
    }

    private static long keyOfPlane(long j17, long j18) {
        return (j17 & io.flutter.embedding.android.KeyboardMap.kValueMask) | j18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendKeyEvent$2(io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, java.nio.ByteBuffer byteBuffer) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = java.lang.Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            io.flutter.Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$0(io.flutter.embedding.android.KeyboardMap.KeyPair keyPair, long j17, android.view.KeyEvent keyEvent) {
        synthesizeEvent(false, java.lang.Long.valueOf(keyPair.logicalKey), java.lang.Long.valueOf(j17), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$1(io.flutter.embedding.android.KeyboardMap.KeyPair keyPair, long j17, android.view.KeyEvent keyEvent) {
        synthesizeEvent(false, java.lang.Long.valueOf(keyPair.logicalKey), java.lang.Long.valueOf(j17), keyEvent.getEventTime());
    }

    private void sendKeyEvent(io.flutter.embedding.android.KeyData keyData, final io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        this.messenger.send(io.flutter.embedding.android.KeyData.CHANNEL, keyData.toBytes(), onKeyEventHandledCallback == null ? null : new io.flutter.plugin.common.BinaryMessenger.BinaryReply() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$a
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
            public final void reply(java.nio.ByteBuffer byteBuffer) {
                io.flutter.embedding.android.KeyEmbedderResponder.lambda$sendKeyEvent$2(io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback.this, byteBuffer);
            }
        });
    }

    private void synthesizeEvent(boolean z17, java.lang.Long l17, java.lang.Long l18, long j17) {
        io.flutter.embedding.android.KeyData keyData = new io.flutter.embedding.android.KeyData();
        keyData.timestamp = j17;
        keyData.type = z17 ? io.flutter.embedding.android.KeyData.Type.kDown : io.flutter.embedding.android.KeyData.Type.kUp;
        keyData.logicalKey = l17.longValue();
        keyData.physicalKey = l18.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = io.flutter.embedding.android.KeyData.DeviceType.kKeyboard;
        if (l18.longValue() != 0 && l17.longValue() != 0) {
            if (!z17) {
                l17 = null;
            }
            updatePressingState(l18, l17);
        }
        sendKeyEvent(keyData, null);
    }

    public java.util.Map<java.lang.Long, java.lang.Long> getPressedState() {
        return java.util.Collections.unmodifiableMap(this.pressingRecords);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(android.view.KeyEvent keyEvent, io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            return;
        }
        synthesizeEvent(true, 0L, 0L, 0L);
        onKeyEventHandledCallback.onKeyEventHandled(true);
    }

    public void synchronizePressingKey(io.flutter.embedding.android.KeyboardMap.PressingGoal pressingGoal, boolean z17, long j17, final long j18, final android.view.KeyEvent keyEvent, java.util.ArrayList<java.lang.Runnable> arrayList) {
        io.flutter.embedding.android.KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
        boolean[] zArr = new boolean[keyPairArr.length];
        java.lang.Boolean[] boolArr = new java.lang.Boolean[keyPairArr.length];
        int i17 = 0;
        boolean z18 = false;
        while (true) {
            io.flutter.embedding.android.KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
            boolean z19 = true;
            if (i17 >= keyPairArr2.length) {
                break;
            }
            final io.flutter.embedding.android.KeyboardMap.KeyPair keyPair = keyPairArr2[i17];
            boolean containsKey = this.pressingRecords.containsKey(java.lang.Long.valueOf(keyPair.physicalKey));
            zArr[i17] = containsKey;
            if (keyPair.logicalKey == j17) {
                int i18 = io.flutter.embedding.android.KeyEmbedderResponder.AnonymousClass1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i18 != 1) {
                    if (i18 == 2) {
                        boolArr[i17] = java.lang.Boolean.valueOf(zArr[i17]);
                    } else if (i18 == 3) {
                        if (!z17) {
                            arrayList.add(new java.lang.Runnable() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    io.flutter.embedding.android.KeyEmbedderResponder.this.lambda$synchronizePressingKey$1(keyPair, j18, keyEvent);
                                }
                            });
                        }
                        boolArr[i17] = java.lang.Boolean.valueOf(zArr[i17]);
                    }
                    i17++;
                } else {
                    boolArr[i17] = java.lang.Boolean.FALSE;
                    if (!z17) {
                        arrayList.add(new java.lang.Runnable() { // from class: io.flutter.embedding.android.KeyEmbedderResponder$$b
                            @Override // java.lang.Runnable
                            public final void run() {
                                io.flutter.embedding.android.KeyEmbedderResponder.this.lambda$synchronizePressingKey$0(keyPair, j18, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z18 && !containsKey) {
                z19 = false;
            }
            z18 = z19;
            i17++;
        }
        if (z17) {
            for (int i19 = 0; i19 < pressingGoal.keys.length; i19++) {
                if (boolArr[i19] == null) {
                    if (z18) {
                        boolArr[i19] = java.lang.Boolean.valueOf(zArr[i19]);
                    } else {
                        boolArr[i19] = java.lang.Boolean.TRUE;
                        z18 = true;
                    }
                }
            }
            if (!z18) {
                boolArr[0] = java.lang.Boolean.TRUE;
            }
        } else {
            for (int i27 = 0; i27 < pressingGoal.keys.length; i27++) {
                if (boolArr[i27] == null) {
                    boolArr[i27] = java.lang.Boolean.FALSE;
                }
            }
        }
        for (int i28 = 0; i28 < pressingGoal.keys.length; i28++) {
            if (zArr[i28] != boolArr[i28].booleanValue()) {
                io.flutter.embedding.android.KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i28];
                synthesizeEvent(boolArr[i28].booleanValue(), java.lang.Long.valueOf(keyPair2.logicalKey), java.lang.Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    public void synchronizeTogglingKey(io.flutter.embedding.android.KeyboardMap.TogglingGoal togglingGoal, boolean z17, long j17, android.view.KeyEvent keyEvent) {
        if (togglingGoal.logicalKey == j17 || togglingGoal.enabled == z17) {
            return;
        }
        boolean z18 = !this.pressingRecords.containsKey(java.lang.Long.valueOf(togglingGoal.physicalKey));
        if (z18) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(z18, java.lang.Long.valueOf(togglingGoal.logicalKey), java.lang.Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        if (!z18) {
            togglingGoal.enabled = !togglingGoal.enabled;
        }
        synthesizeEvent(!z18, java.lang.Long.valueOf(togglingGoal.logicalKey), java.lang.Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
    }

    public void updatePressingState(java.lang.Long l17, java.lang.Long l18) {
        if (l18 != null) {
            if (this.pressingRecords.put(l17, l18) != null) {
                throw new java.lang.AssertionError("The key was not empty");
            }
        } else if (this.pressingRecords.remove(l17) == null) {
            throw new java.lang.AssertionError("The key was empty");
        }
    }
}
